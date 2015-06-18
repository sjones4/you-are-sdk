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
package com.github.sjones4.youcan.youserv.model.transform;

import javax.xml.stream.events.XMLEvent;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.github.sjones4.youcan.youserv.model.ServiceCertificate;

/**
 *
 */
public class ServiceCertificateStaxUnmarshaller implements Unmarshaller<ServiceCertificate, StaxUnmarshallerContext> {

  public ServiceCertificate unmarshall( final StaxUnmarshallerContext context ) throws Exception {
    ServiceCertificate serviceCertificate = new ServiceCertificate();
    int originalDepth = context.getCurrentDepth();
    int targetDepth = originalDepth + 1;

    if (context.isStartOfDocument()) targetDepth += 1;

    while (true) {
      XMLEvent xmlEvent = context.nextEvent();
      if (xmlEvent.isEndDocument()) return serviceCertificate;

      if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
        if (context.testExpression("serviceType", targetDepth)) {
          serviceCertificate.setServiceType( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance( ).unmarshall( context ) );
          continue;
        }
        if (context.testExpression("certificateUsage", targetDepth)) {
          serviceCertificate.setCertificateUsage( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance( ).unmarshall( context ) );
          continue;
        }
        if (context.testExpression("certificateFormat", targetDepth)) {
          serviceCertificate.setCertificateFormat( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance( ).unmarshall( context ) );
          continue;
        }
        if (context.testExpression("certificate", targetDepth)) {
          serviceCertificate.setCertificate( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance( ).unmarshall( context ) );
          continue;
        }
        if (context.testExpression("certificateFingerprintDigest", targetDepth)) {
          serviceCertificate.setCertificateFingerprintDigest( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance( ).unmarshall( context ) );
          continue;
        }
        if (context.testExpression("certificateFingerprint", targetDepth)) {
          serviceCertificate.setCertificateFingerprint( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance( ).unmarshall( context ) );
          continue;
        }
      } else if (xmlEvent.isEndElement()) {
        if (context.getCurrentDepth() < originalDepth) {
          return serviceCertificate;
        }
      }
    }
  }

  private static ServiceCertificateStaxUnmarshaller instance = new ServiceCertificateStaxUnmarshaller( );
  public static ServiceCertificateStaxUnmarshaller getInstance() {
    return instance;
  }
}
