/*************************************************************************
 * Copyright 2009-2014 Eucalyptus Systems, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Please contact Eucalyptus Systems, Inc., 6755 Hollister Ave., Goleta
 * CA 93117, USA or visit http://www.eucalyptus.com/licenses/ if you need
 * additional information or have any questions.
 ************************************************************************/
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
