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
package com.github.sjones4.youcan.youprop.model.transform;

import javax.xml.stream.events.XMLEvent;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.github.sjones4.youcan.youprop.model.ModifyPropertyValueResult;

/**
 *
 */
public class ModifyPropertyValueResultStaxUnmarshaller implements Unmarshaller<ModifyPropertyValueResult, StaxUnmarshallerContext> {

  public ModifyPropertyValueResult unmarshall(StaxUnmarshallerContext context) throws Exception {
    ModifyPropertyValueResult modifyPropertyValueResult = new ModifyPropertyValueResult();
    int originalDepth = context.getCurrentDepth();
    int targetDepth = originalDepth + 1;


    if (context.isStartOfDocument()) targetDepth += 1;

    while (true) {
      XMLEvent xmlEvent = context.nextEvent();
      if (xmlEvent.isEndDocument()) return modifyPropertyValueResult;

      if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
        if (context.testExpression("name", targetDepth)) {
          modifyPropertyValueResult.setName( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("value", targetDepth)) {
          modifyPropertyValueResult.setValue( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
        if (context.testExpression("oldValue", targetDepth)) {
          modifyPropertyValueResult.setOldValue( SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall( context ) );
          continue;
        }
      } else if (xmlEvent.isEndElement()) {
        if (context.getCurrentDepth() < originalDepth) {
          return modifyPropertyValueResult;
        }
      }
    }
  }

  private static ModifyPropertyValueResultStaxUnmarshaller instance = new ModifyPropertyValueResultStaxUnmarshaller();
  public static ModifyPropertyValueResultStaxUnmarshaller getInstance() {
    return instance;
  }
}
