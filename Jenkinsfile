pipeline {
    agent any
    triggers {
        pollSCM('* * * * *')
    }
    stages {
        stage('Pullcode') {
            checkout([
                $class: 'GitSCM', 
                branches: [
                    [name: '*/master']
                ], 
                doGenerateSubmoduleConfigurations: false, 
                extensions: [], 
                submoduleCfg: [], 
                userRemoteConfigs: [
                    [url: 'https://github.com/suriyaJaboon/demo-tdd1.git']
                ]
            ])
            // steps {
            //     git 'https://github.com/suriyaJaboon/demo-tdd1.git'
            // }
        }
        stage('Testing') {
            checkout([
                $class: 'GitSCM', 
                branches: [
                    [name: '*/develop'],
                    [name: '*/feature-*']
                ], 
                doGenerateSubmoduleConfigurations: false, 
                extensions: [], 
                submoduleCfg: [], 
                userRemoteConfigs: [
                    [url: 'https://github.com/suriyaJaboon/demo-tdd1.git']
                ]
            ])
            steps {
                sh "mvn clean test"
                junit 'target/surefire-reports/*.xml'
            }
        }
        stage('Package') {
            steps { 
                sh "mvn clean package"
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