package com.piper

class Constants {
    static final DEPLOY_ENV       = ["dev", "uat", "qa", "prod"].join('\n')
    static final DEPLOY_TYPE      = ["rolling-update", "blue-green"].join("\n")
}