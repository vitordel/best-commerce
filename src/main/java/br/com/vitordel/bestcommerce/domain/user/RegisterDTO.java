package br.com.vitordel.bestcommerce.domain.user;

public record RegisterDTO(String username, String password, UserRole role) {
}