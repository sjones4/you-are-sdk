/*
 * Copyright 2014 Steve Jones. All Rights Reserved.
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
package com.github.sjones4.youcan.youtwo.model.transform;

import javax.xml.stream.events.XMLEvent;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.github.sjones4.youcan.youtwo.model.InstanceTypeZoneStatus;

/**
 *
 */
public class InstanceTypeZoneStatusStaxUnmarshaller implements Unmarshaller<InstanceTypeZoneStatus, StaxUnmarshallerContext> {

  public InstanceTypeZoneStatus unmarshall(StaxUnmarshallerContext context) throws Exception {
    InstanceTypeZoneStatus instanceTypeZoneStatus = new InstanceTypeZoneStatus();
    int originalDepth = context.getCurrentDepth();
    int targetDepth = originalDepth + 1;

    if (context.isStartOfDocument()) targetDepth += 2;

    while (true) {
      XMLEvent xmlEvent = context.nextEvent();
      if (xmlEvent.isEndDocument()) return instanceTypeZoneStatus;

      if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
        if (context.testExpression("name", targetDepth)) {
          instanceTypeZoneStatus.setName( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("zoneName", targetDepth)) {
          instanceTypeZoneStatus.setZoneName( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("max", targetDepth)) {
          instanceTypeZoneStatus.setMax( SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("available", targetDepth)) {
          instanceTypeZoneStatus.setAvailable( SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
      } else if (xmlEvent.isEndElement()) {
        if (context.getCurrentDepth() < originalDepth) {
          return instanceTypeZoneStatus;
        }
      }
    }
  }

  private static InstanceTypeZoneStatusStaxUnmarshaller instance = new InstanceTypeZoneStatusStaxUnmarshaller();
  public static InstanceTypeZoneStatusStaxUnmarshaller getInstance() {
    return instance;
  }
}
