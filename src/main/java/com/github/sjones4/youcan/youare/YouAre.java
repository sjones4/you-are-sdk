/*
 * Copyright 2013 Steve Jones. All Rights Reserved.
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
package com.github.sjones4.youcan.youare;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.identitymanagement.AmazonIdentityManagement;
import com.github.sjones4.youcan.youare.model.CreateAccountRequest;
import com.github.sjones4.youcan.youare.model.CreateAccountResult;
import com.github.sjones4.youcan.youare.model.DeleteAccountPolicyRequest;
import com.github.sjones4.youcan.youare.model.DeleteAccountRequest;
import com.github.sjones4.youcan.youare.model.GetAccountPolicyRequest;
import com.github.sjones4.youcan.youare.model.GetAccountPolicyResult;
import com.github.sjones4.youcan.youare.model.ListAccountPoliciesRequest;
import com.github.sjones4.youcan.youare.model.ListAccountPoliciesResult;
import com.github.sjones4.youcan.youare.model.ListAccountsRequest;
import com.github.sjones4.youcan.youare.model.ListAccountsResult;
import com.github.sjones4.youcan.youare.model.PutAccountPolicyRequest;

/**
 *
 */
public interface YouAre extends AmazonIdentityManagement {
  CreateAccountResult createAccount( CreateAccountRequest createAccountRequest ) throws AmazonServiceException, AmazonClientException;

  void deleteAccount( DeleteAccountRequest deleteAccountRequest ) throws AmazonServiceException, AmazonClientException;

  ListAccountsResult listAccounts( ) throws AmazonServiceException, AmazonClientException;

  ListAccountsResult listAccounts( ListAccountsRequest listAccountsRequest ) throws AmazonServiceException, AmazonClientException;

  void putAccountPolicy( PutAccountPolicyRequest putAccountPolicyRequest ) throws AmazonServiceException, AmazonClientException;

  void deleteAccountPolicy( DeleteAccountPolicyRequest deleteAccountPolicyRequest ) throws AmazonServiceException, AmazonClientException;

  ListAccountPoliciesResult listAccountPolicies( ListAccountPoliciesRequest listAccountPoliciesRequest ) throws AmazonServiceException, AmazonClientException;

  GetAccountPolicyResult getAccountPolicy( GetAccountPolicyRequest getAccountPolicyRequest ) throws AmazonServiceException, AmazonClientException;
}
