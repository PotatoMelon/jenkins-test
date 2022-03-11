def buildApp() {
    echo "building the application..."
}

def testApp() {
    echo "testing the applicaion..."
}

def deployApp() {
    echo "deploying app version ${params.version}"
}

return this