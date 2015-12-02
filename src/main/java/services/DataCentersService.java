/*
Copyright (c) 2015 Red Hat, Inc.

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

package services;

import org.ovirt.api.metamodel.annotations.In;
import org.ovirt.api.metamodel.annotations.Out;
import org.ovirt.api.metamodel.annotations.Service;
import types.DataCenter;

@Service
public interface DataCentersService {
    interface Add {
        @In @Out DataCenter dataCenter();
    }

    interface List {
        @Out DataCenter[] dataCenters();

        /**
         * Sets the maximum number of data centers to return. If not specified all the data centers are returned.
         */
        @In Integer max();

        /**
         * A query string used to restrict the returned data centers.
         */
        @In String search();
    }

    @Service DataCenterService dataCenter(String id);
}
