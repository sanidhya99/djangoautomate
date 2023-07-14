pipeline {
  agent any
  
  stages {
    stage('Deploy') {
      steps {
        script {
          sh 'aws cloudformation create-stack --stack-name djangoautomation --template-url "https://github.com/sanidhya99/djangoautomate/blob/main/task.yaml"

        }
      }
    }
  }
}
