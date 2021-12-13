package com.codef.ecommerce.checkout.service;

import com.codef.ecommerce.checkout.entity.CheckoutEntity;
import com.codef.ecommerce.checkout.resource.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

   Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

   Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);

}
