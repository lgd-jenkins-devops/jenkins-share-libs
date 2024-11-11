def uploadToBucket(String filePath, String bucketName) {
    echo "Upload  ${filePath}"
    sh """
        gcloud auth activate-service-account --key-file=${GOOGLE_APPLICATION_CREDENTIALS}
        gsutil -h "Cache-Control:no-cache, no-store, must-revalidate" cp ${filePath} gs://${bucketName}/
    """
}

return this