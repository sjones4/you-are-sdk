/*
 * Copyright 2015 Steve Jones. All Rights Reserved.
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
package com.github.sjones4.youcan.youserv.model;

import java.io.Serializable;

/**
 *
 */
public class ServiceCertificate implements Serializable {
  private static final long serialVersionUID = 1L;

  private String serviceType;
  private String certificateUsage;
  private String certificateFormat;
  private String certificate;
  private String certificateFingerprint;
  private String certificateFingerprintDigest;

  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType( final String serviceType ) {
    this.serviceType = serviceType;
  }

  public String getCertificateUsage() {
    return certificateUsage;
  }

  public void setCertificateUsage( final String certificateUsage ) {
    this.certificateUsage = certificateUsage;
  }

  public String getCertificateFormat() {
    return certificateFormat;
  }

  public void setCertificateFormat( final String certificateFormat ) {
    this.certificateFormat = certificateFormat;
  }

  public String getCertificate() {
    return certificate;
  }

  public void setCertificate( final String certificate ) {
    this.certificate = certificate;
  }

  public String getCertificateFingerprint() {
    return certificateFingerprint;
  }

  public void setCertificateFingerprint( final String certificateFingerprint ) {
    this.certificateFingerprint = certificateFingerprint;
  }

  public String getCertificateFingerprintDigest() {
    return certificateFingerprintDigest;
  }

  public void setCertificateFingerprintDigest( final String certificateFingerprintDigest ) {
    this.certificateFingerprintDigest = certificateFingerprintDigest;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getServiceType( ) != null) sb.append("ServiceType: " + getServiceType( ) + ",");
    if (getCertificateUsage() != null) sb.append("CertificateUsage: " + getCertificateUsage( ) + ",");
    if (getCertificateFormat() != null) sb.append("CertificateFormat: " + getCertificateFormat( ) + ",");
    if (getCertificate() != null) sb.append("Certificate: " + getCertificate( ) + ",");
    if (getCertificateFingerprintDigest() != null) sb.append("CertificateFingerprintDigest: " + getCertificateFingerprintDigest( ) + ",");
    if (getCertificateFingerprint() != null) sb.append("CertificateFingerprint: " + getCertificateFingerprint() + ",");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getServiceType( ) == null) ? 0 : getServiceType( ).hashCode());
    hashCode = prime * hashCode + ((getCertificateUsage( ) == null) ? 0 : getCertificateUsage( ).hashCode());
    hashCode = prime * hashCode + ((getCertificateFormat( ) == null) ? 0 : getCertificateFormat( ).hashCode());
    hashCode = prime * hashCode + ((getCertificate( ) == null) ? 0 : getCertificate( ).hashCode());
    hashCode = prime * hashCode + ((getCertificateFingerprintDigest( ) == null) ? 0 : getCertificateFingerprintDigest( ).hashCode());
    hashCode = prime * hashCode + ((getCertificateFingerprint( ) == null) ? 0 : getCertificateFingerprint( ).hashCode());
    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof ServiceCertificate == false) return false;
    ServiceCertificate other = (ServiceCertificate)obj;

    if (other.getServiceType( ) == null ^ this.getServiceType( ) == null) return false;
    if (other.getServiceType( ) != null && other.getServiceType( ).equals(this.getServiceType( )) == false) return false;
    if (other.getCertificateUsage( ) == null ^ this.getCertificateUsage( ) == null) return false;
    if (other.getCertificateUsage( ) != null && other.getCertificateUsage( ).equals(this.getCertificateUsage( )) == false) return false;
    if (other.getCertificateFormat( ) == null ^ this.getCertificateFormat( ) == null) return false;
    if (other.getCertificateFormat( ) != null && other.getCertificateFormat( ).equals(this.getCertificateFormat( )) == false) return false;
    if (other.getCertificate( ) == null ^ this.getCertificate( ) == null) return false;
    if (other.getCertificate( ) != null && other.getCertificate().equals(this.getCertificate()) == false) return false;
    if (other.getCertificateFingerprintDigest( ) == null ^ this.getCertificateFingerprintDigest() == null) return false;
    if (other.getCertificateFingerprintDigest( ) != null && other.getCertificateFingerprintDigest().equals(this.getCertificateFingerprintDigest()) == false) return false;
    if (other.getCertificateFingerprint( ) == null ^ this.getCertificateFingerprint() == null) return false;
    if (other.getCertificateFingerprint() != null && other.getCertificateFingerprint().equals(this.getCertificateFingerprint()) == false) return false;
    return true;
  }
}
