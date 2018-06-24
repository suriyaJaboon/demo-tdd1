pipeline {
    agent any
    triggers {
        pollSCM('* * * * *')
    }
    stages {
        stage('Pullcode') {
            steps {
                git 'https://github.com/suriyaJaboon/demo-tdd1.git'
            }
        }
        stage('Testing') {
            steps {
                sh "mvn clean test"
                junit 'target/surefire-reports/*.xml'
            }
        }
        stage('Package') {
            steps { 
                sh "mvn package"
            }
        }
        stage('Code coverage') {
            steps {
                cobertura autoUpdateHealth: false, autoUpdateStability: false, coberturaReportFile: '**/target/site/cobertura/coverage.xml', failUnhealthy: false, failUnstable: false
            }
          }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }   

    }
}