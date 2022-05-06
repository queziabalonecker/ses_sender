package br.com.ses_sender.services;

import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ses.SesClient;

public interface SESClient {
    public static SesClient returnSESClient(AwsCredentialsProvider credentialsProvider) {
        SesClient sesClient = SesClient.builder()
                .region(Region.US_EAST_1)
                .credentialsProvider(credentialsProvider)
                .build();
        return sesClient;
    };
};