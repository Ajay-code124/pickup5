pipeline {
    agent any

    environment {
        IMAGE_NAME = "tajay246/pickup:latest"
        OPENSHIFT_SERVER = "https://api.rm1.0a51.p1.openshiftapps.com:6443"
        OPENSHIFT_PROJECT = "tajay246-dev"
        KSVC_NAME = "pickup-4-git"
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build Maven Project') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t %IMAGE_NAME% .'
            }
        }

        stage('Docker Login') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub-creds',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]) {
                    bat 'echo %DOCKER_PASS% | docker login -u %DOCKER_USER% --password-stdin'
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                bat 'docker push %IMAGE_NAME%'
            }
        }

        stage('Deploy to OpenShift') {
            steps {
                withCredentials([string(credentialsId: 'openshift-token', variable: 'TOKEN')]) {
                    bat """
                    oc login --token=%TOKEN% --server=%OPENSHIFT_SERVER%
                    oc project %OPENSHIFT_PROJECT%
                    oc patch ksvc %KSVC_NAME% --type=merge -p "{\\"spec\\":{\\"template\\":{\\"spec\\":{\\"containers\\":[{\\"image\\":\\"%IMAGE_NAME%\\"}]}}}}"
                    """
                }
            }
        }
    }

    post {
        success {
            echo 'Build, Push and Deployment completed successfully.'
        }

        failure {
            echo 'Pipeline failed.'
        }
    }
}