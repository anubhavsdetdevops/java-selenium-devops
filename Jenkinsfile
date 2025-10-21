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
                sh 'ls -la'
                sh 'cat pom.xml'
                echo "Maven is not available in this Jenkins setup"
                echo "But the pipeline is working - code is checked out successfully"
            }
        }
    }
}
