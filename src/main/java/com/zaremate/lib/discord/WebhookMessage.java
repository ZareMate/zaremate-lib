package com.zaremate.lib.discord;
public record WebhookMessage(String content, String username, String avatarUrl) {
    public WebhookMessage {
        if (content == null) throw new IllegalArgumentException("content cannot be null");
        username = username == null ? "" : username;
        avatarUrl = avatarUrl == null ? "" : avatarUrl;
    }
    public static WebhookMessage of(String content) { return new WebhookMessage(content, "", ""); }
}
