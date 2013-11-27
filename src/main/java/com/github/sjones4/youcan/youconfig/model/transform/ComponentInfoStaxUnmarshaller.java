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
package com.github.sjones4.youcan.youconfig.model.transform;

import javax.xml.stream.events.XMLEvent;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.github.sjones4.youcan.youconfig.model.ComponentInfo;

/**
 *
 */
public class ComponentInfoStaxUnmarshaller  implements Unmarshaller<ComponentInfo, StaxUnmarshallerContext> {

  public ComponentInfo unmarshall( final StaxUnmarshallerContext context ) throws Exception {
    ComponentInfo componentInfo = new ComponentInfo();
    int originalDepth = context.getCurrentDepth();
    int targetDepth = originalDepth + 1;

    if (context.isStartOfDocument()) targetDepth += 1;

    while (true) {
      XMLEvent xmlEvent = context.nextEvent();
      if (xmlEvent.isEndDocument()) return componentInfo;

      if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
        if (context.testExpression("type", targetDepth)) {
          componentInfo.setType( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("partition", targetDepth)) {
          componentInfo.setPartition( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("name", targetDepth)) {
          componentInfo.setName( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("hostName", targetDepth)) {
          componentInfo.setHostName( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("fullName", targetDepth)) {
          componentInfo.setFullName( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("state", targetDepth)) {
          componentInfo.setState( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("detail", targetDepth)) {
          componentInfo.setDetail( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
      } else if (xmlEvent.isEndElement()) {
        if (context.getCurrentDepth() < originalDepth) {
          return componentInfo;
        }
      }
    }
  }

  private static ComponentInfoStaxUnmarshaller instance = new ComponentInfoStaxUnmarshaller( );
  public static ComponentInfoStaxUnmarshaller getInstance() {
    return instance;
  }
}
