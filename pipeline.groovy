pipeline {
    agent any
    stages {
        stage('git_pull') {
            steps {
                echo "pull success"
            }
        }
        stage('build') {
            steps {
                 echo "build success"
            }
        }
        stage('test') {
            steps {
                echo "test success"
            }
        }
        stage('deploy') {
            steps {
                echo "deploy sucess"
            }
        }
    }
}
