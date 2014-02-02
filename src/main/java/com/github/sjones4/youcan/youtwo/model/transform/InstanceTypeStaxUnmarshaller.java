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
import com.github.sjones4.youcan.youtwo.model.InstanceType;

/**
 *
 */
public class InstanceTypeStaxUnmarshaller implements Unmarshaller<InstanceType, StaxUnmarshallerContext> {

  public InstanceType unmarshall( StaxUnmarshallerContext context ) throws Exception {
    InstanceType instanceType = new InstanceType();
    int originalDepth = context.getCurrentDepth();
    int targetDepth = originalDepth + 1;


    if (context.isStartOfDocument()) targetDepth += 1;


    while (true) {
      XMLEvent xmlEvent = context.nextEvent();
      if (xmlEvent.isEndDocument()) return instanceType;

      if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
        if (context.testExpression("name", targetDepth)) {
          instanceType.setName( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("cpu", targetDepth)) {
          instanceType.setCpu( SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("disk", targetDepth)) {
          instanceType.setDisk( SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("memory", targetDepth)) {
          instanceType.setMemory( SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("availability/item", targetDepth)) {
          instanceType.getAvailability().add( InstanceTypeZoneStatusStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("availability/item", targetDepth)) {
          instanceType.getEphemeralDisk().add( InstanceTypeEphemeralDiskStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
      } else if (xmlEvent.isEndElement()) {
        if (context.getCurrentDepth() < originalDepth) {
          return instanceType;
        }
      }
    }
  }

  private static InstanceTypeStaxUnmarshaller instance = new InstanceTypeStaxUnmarshaller();
  public static InstanceTypeStaxUnmarshaller getInstance() {
    return instance;
  }
}
