def call(String appDir = '.'){
    stage('Build'){
         echo "Building the app from ${appDir}"
          sh "ls ${appDir}"
    }
    stage('Deploy'){
          echo "Deploying the app..."
          sh "cp ${appDir}/index.html /var/www/html/index.html"
          echo "Deplyment complete!"
      }
}

