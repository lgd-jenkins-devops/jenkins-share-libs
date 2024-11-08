def uploadToBucket(String filePath, String bucketName) {
    echo "Upload  ${filePath}"
    sh """
        gcloud auth activate-service-account --key-file=${GOOGLE_APPLICATION_CREDENTIALS}
        #gsutil cp ${filePath} gs://${bucketName}/
        gsutil ls
    """
}

return this