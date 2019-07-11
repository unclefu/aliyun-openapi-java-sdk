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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.CreateServerlessApplicationResponse;
import com.aliyuncs.edas.model.v20170801.CreateServerlessApplicationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateServerlessApplicationResponseUnmarshaller {

	public static CreateServerlessApplicationResponse unmarshall(CreateServerlessApplicationResponse createServerlessApplicationResponse, UnmarshallerContext _ctx) {
		
		createServerlessApplicationResponse.setCode(_ctx.integerValue("CreateServerlessApplicationResponse.Code"));
		createServerlessApplicationResponse.setMessage(_ctx.stringValue("CreateServerlessApplicationResponse.Message"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("CreateServerlessApplicationResponse.Data.AppId"));
		data.setChangeOrderId(_ctx.stringValue("CreateServerlessApplicationResponse.Data.ChangeOrderId"));
		createServerlessApplicationResponse.setData(data);
	 
	 	return createServerlessApplicationResponse;
	}
}