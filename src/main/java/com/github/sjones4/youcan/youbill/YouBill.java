/*
 * Copyright 2016 Steve Jones. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.github.sjones4.youcan.youbill;

import com.amazonaws.AmazonClientException;
import com.github.sjones4.youcan.youbill.model.ModifyAccountRequest;
import com.github.sjones4.youcan.youbill.model.ModifyAccountResult;
import com.github.sjones4.youcan.youbill.model.ModifyBillingRequest;
import com.github.sjones4.youcan.youbill.model.ModifyBillingResult;
import com.github.sjones4.youcan.youbill.model.ViewAccountRequest;
import com.github.sjones4.youcan.youbill.model.ViewAccountResult;
import com.github.sjones4.youcan.youbill.model.ViewBillingRequest;
import com.github.sjones4.youcan.youbill.model.ViewBillingResult;
import com.github.sjones4.youcan.youbill.model.ViewMonthlyUsageRequest;
import com.github.sjones4.youcan.youbill.model.ViewMonthlyUsageResult;
import com.github.sjones4.youcan.youbill.model.ViewUsageRequest;
import com.github.sjones4.youcan.youbill.model.ViewUsageResult;

/**
 * AWS Billing Console / AWS Portal service
 */
public interface YouBill {

  ViewAccountResult viewAccount( final ViewAccountRequest viewAccountRequest ) throws AmazonClientException;

  ModifyAccountResult modifyAccount( final ModifyAccountRequest modifyAccountRequest ) throws AmazonClientException;

  ViewBillingResult viewBilling( final ViewBillingRequest viewBillingRequest ) throws AmazonClientException;

  ModifyBillingResult modifyBilling( final ModifyBillingRequest modifyBillingRequest ) throws AmazonClientException;

  ViewUsageResult viewUsage(final ViewUsageRequest viewUsageRequest ) throws AmazonClientException;

  ViewMonthlyUsageResult viewMonthlyUsage(final ViewMonthlyUsageRequest viewMonthlyUsageRequest ) throws AmazonClientException;
}
