#!/bin/bash
# Script para subir un archivo a GCS
gsutil cp ${1} gs://${2}/