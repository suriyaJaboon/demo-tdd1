// pipeline {
//     agent any
//     stages {
//         stage('Pullcode') {
//             steps {
//                 git 'https://github.com/suriyaJaboon/demo-tdd1.git'
//             }
//         }
//         stage('Build') {
//             when {
//                 // check if branch is master
//                 branch 'master'
//             }
//             steps {
//                 sh './mvnw clean package'
//             }
//         }

//         stage('Develop') {
//             when {
//                 branch 'develop'
//             }
//             steps {
//                 sh './mvnw clean test'
//             }
//         }

//         stage('Testing') {
//             when {
//                 branch 'feature-*'
//             }
//             steps {
//                 sh './mvnw clean test'
//                 junit 'target/surefire-reports/*.xml'
//           }
//         }
//         stage('Code coverage') {
//           steps {
//              cobertura autoUpdateHealth: false, autoUpdateStability: false, coberturaReportFile: '**/target/site/cobertura/coverage.xml', failUnhealthy: false, failUnstable: false
//           }
//         }
//       }
//       post {
//         always {
//             junit 'target/surefire-reports/*.xml'
//         }
//       }
// }

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