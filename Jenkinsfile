pipeline {
    agent {
        docker {
            image 'maven:3.8-openjdk-17'
            args '-v /root/.m2:/root/.m2'
        }
    }
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/anubhavsdetdevops/java-selenium-devops.git'
            }
        }
        
        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
    
    post {
        always {
            archiveArtifacts 'target/surefire-reports/**/*'
        }
    }
}
