/*
    Copyright 2010 Nathan Marz
 
    Project and contact information: http://www.cascalog.org/ 

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
   
        http://www.apache.org/licenses/LICENSE-2.0
   
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

package cascalog;

import cascading.operation.FilterCall;
import cascading.operation.FunctionCall;
import cascading.tuple.Fields;
import cascading.tuple.TupleEntry;

public class FilterFunctionCall implements FilterCall {
  FunctionCall func;

  public FilterFunctionCall(FunctionCall func) {
    this.func = func;
  }

  public Object getContext() {
    return func.getContext();
  }

  public void setContext(Object o) {
    func.setContext(o);
  }

  public Fields getArgumentFields() {
    return func.getArgumentFields();
  }

  public TupleEntry getArguments() {
    return func.getArguments();
  }


}
