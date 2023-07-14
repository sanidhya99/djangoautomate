pipeline {
  agent any
  
  stages {
    stage('Deploy') {
      steps {
        script {
          sh 'aws cloudformation create-stack --stack-name my-stack --template-body file://path/to/your/cloudformation/template.yml'
        }
      }
    }
  }
}
