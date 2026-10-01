package com.zaremate.lib.discord;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
public final class DiscordWebhook {
    private static final HttpClient CLIENT = HttpClient.newHttpClient();
    private DiscordWebhook() {}
    public static void send(String webhookUrl, WebhookMessage message) throws IOException, InterruptedException {
        String json = "{\"content\":\"" + escapeJson(message.content()) + "\""
                + (message.username().isBlank() ? "" : ",\"username\":\"" + escapeJson(message.username()) + "\"")
                + (message.avatarUrl().isBlank() ? "" : ",\"avatar_url\":\"" + escapeJson(message.avatarUrl()) + "\"")
                + "}";
        HttpRequest request = HttpRequest.newBuilder(URI.create(webhookUrl))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json, StandardCharsets.UTF_8))
                .build();
        CLIENT.send(request, HttpResponse.BodyHandlers.discarding());
    }
    private static String escapeJson(String value) {
        return value.replace("\\", "\\\\").replace("\"", "\\\"")
                .replace("\b", "\\b").replace("\f", "\\f")
                .replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    }
}
