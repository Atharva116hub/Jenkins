//pipeline {
//     agent any
//     stages {
//         stage('git_pull') {
//             steps {
//                 echo "pull success"
//             }
//         }
//         stage('build') {
//             steps {
//                  echo "build success"
//             }
//         }
//         stage('test') {
//             steps {
//                 echo "test success"
//             }
//         }
//                 stage('depoly') {
//             steps {
//                 sh 'deploy success'
//             }
//         }
//     }
// }

pipeline {
    agent {label 'node'}
    stages {
        stage('git_checkout') {
            steps {
               git branch: 'main', url: 'https://github.com/Anilbamnote/student-ui-app.git'
            }
        }
        stage('build') {
            steps {
               echo " build sucess"
            }
        }
        stage('test') {
            steps {
                echo "test success"
            }
        }
                stage('depoly') {
            steps {
               echo "deploy success"
            }
        }
    }
}
