package com.itsm.platform.common.util.hashmap;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * HashMap和对象数组的转换器.
 */
public class HashMapAdapter extends XmlAdapter<HashMapItem[], HashMap<String, String>> {

    @Override
    public HashMapItem[] marshal(HashMap<String, String> map) throws Exception {

        if (map != null) {
            HashMapItem[] pairs = new HashMapItem[map.size()];
            int i = 0;
            for (Entry<String, String> entry : map.entrySet()) {
                pairs[i++] = new HashMapItem(entry.getKey(), entry.getValue());
            }
            return pairs;
        }

        return null;
    }

    @Override
    public HashMap<String, String> unmarshal(HashMapItem[] items) throws Exception {
        HashMap<String, String> r = new HashMap<String, String>();
        for (HashMapItem c : items) {
            r.put(c.key, c.value);
        }

        return r;
    }


}
