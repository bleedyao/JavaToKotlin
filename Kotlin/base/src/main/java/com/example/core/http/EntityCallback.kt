package com.example.core.http

interface EntityCallback<T> {
    fun onSuccess(entity: Any)
    fun onFailure(message: String?)
}