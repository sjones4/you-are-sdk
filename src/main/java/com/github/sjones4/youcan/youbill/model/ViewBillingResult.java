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
package com.github.sjones4.youcan.youbill.model;

import java.io.Serializable;

/**
 *
 */
public class ViewBillingResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private BillingSettings billingSettings;
  private BillingMetadata billingMetadata;

  public BillingSettings getBillingSettings( ) {
    return billingSettings;
  }

  public void setBillingSettings( final BillingSettings billingSettings ) {
    this.billingSettings = billingSettings;
  }

  public BillingMetadata getBillingMetadata( ) {
    return billingMetadata;
  }

  public void setBillingMetadata( final BillingMetadata billingMetadata ) {
    this.billingMetadata = billingMetadata;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder( );
    sb.append( "{" );
    if (getBillingSettings() != null) sb.append("BillingSettings: " + getBillingSettings() );
    if (getBillingMetadata() != null) sb.append("BillingMetadata: " + getBillingMetadata() );
    sb.append( "}" );
    return sb.toString( );
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getBillingSettings() == null) ? 0 : getBillingSettings().hashCode());
    hashCode = prime * hashCode + ((getBillingMetadata() == null) ? 0 : getBillingMetadata().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals( Object obj ) {
    if ( this == obj ) return true;
    if ( obj == null ) return false;

    if ( obj instanceof ViewBillingResult == false ) return false;
    ViewBillingResult other = (ViewBillingResult) obj;

    if (other.getBillingSettings() == null ^ this.getBillingSettings() == null) return false;
    if (other.getBillingSettings() != null && other.getBillingSettings().equals(this.getBillingSettings()) == false) return false;
    if (other.getBillingMetadata() == null ^ this.getBillingMetadata() == null) return false;
    if (other.getBillingMetadata() != null && other.getBillingMetadata().equals(this.getBillingMetadata()) == false) return false;
    return true;
  }
}