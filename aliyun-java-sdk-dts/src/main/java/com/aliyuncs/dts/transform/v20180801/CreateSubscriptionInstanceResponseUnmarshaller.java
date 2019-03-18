/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.dts.transform.v20180801;

import com.aliyuncs.dts.model.v20180801.CreateSubscriptionInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSubscriptionInstanceResponseUnmarshaller {

	public static CreateSubscriptionInstanceResponse unmarshall(CreateSubscriptionInstanceResponse createSubscriptionInstanceResponse, UnmarshallerContext context) {
		
		createSubscriptionInstanceResponse.setRequestId(context.stringValue("CreateSubscriptionInstanceResponse.RequestId"));
		createSubscriptionInstanceResponse.setSuccess(context.stringValue("CreateSubscriptionInstanceResponse.Success"));
		createSubscriptionInstanceResponse.setErrCode(context.stringValue("CreateSubscriptionInstanceResponse.ErrCode"));
		createSubscriptionInstanceResponse.setErrMessage(context.stringValue("CreateSubscriptionInstanceResponse.ErrMessage"));
		createSubscriptionInstanceResponse.setSubscriptionInstanceId(context.stringValue("CreateSubscriptionInstanceResponse.SubscriptionInstanceId"));
	 
	 	return createSubscriptionInstanceResponse;
	}
}