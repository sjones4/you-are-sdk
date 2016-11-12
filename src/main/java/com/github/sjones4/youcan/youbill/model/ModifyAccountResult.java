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
public class ModifyAccountResult implements Serializable {
  private static final long serialVersionUID = 1L;

  private AccountSettings accountSettings;

  public AccountSettings getAccountSettings() {
    return accountSettings;
  }

  public void setAccountSettings( final AccountSettings accountSettings ) {
    this.accountSettings = accountSettings;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder( );
    sb.append( "{" );
    if (getAccountSettings() != null) sb.append("AccountSettings: " + getAccountSettings() );
    sb.append( "}" );
    return sb.toString( );
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getAccountSettings() == null) ? 0 : getAccountSettings().hashCode());
    return hashCode;
  }

  @Override
  public boolean equals( Object obj ) {
    if ( this == obj ) return true;
    if ( obj == null ) return false;

    if ( obj instanceof ModifyAccountResult == false ) return false;
    ModifyAccountResult other = (ModifyAccountResult) obj;

    if (other.getAccountSettings() == null ^ this.getAccountSettings() == null) return false;
    if (other.getAccountSettings() != null && other.getAccountSettings().equals(this.getAccountSettings()) == false) return false;
    return true;
  }
}