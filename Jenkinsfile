pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building Spring Boot application...'
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Build Image') {
            steps {
                echo 'Docker image build step'
                echo 'Will be added after Docker/OpenShift image build is configured'
            }
        }

        stage('Deploy') {
            steps {
                echo 'OpenShift deployment step'
                echo 'Will be added after oc login is configured'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }

        failure {
            echo 'Pipeline failed!'
        }
    }
}