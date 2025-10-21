pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/anubhavsdetdevops/java-selenium-devops.git'
            }
        }
        
        stage('Build & Test') {
            steps {
                sh '''
                    echo "Installing Maven..."
                    apt-get update && apt-get install -y maven
                    echo "Running tests..."
                    mvn clean test
                '''
            }
        }
    }
    
    post {
        always {
            archiveArtifacts 'target/surefire-reports/**/*'
        }
    }
}
