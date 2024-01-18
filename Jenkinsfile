pipeline {
    agent any
    stages {
        stage('Print PATH') {
            steps {
                script {
                    sh 'echo $PATH'
                }
            }
        }

        stage('Run Tests') {
            steps {
                script {
                    sh 'mvn clean test -Dtest="TagRunner"'
                }
            }
        }
    }
}