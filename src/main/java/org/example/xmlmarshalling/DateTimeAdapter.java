package org.example.xmlmarshalling;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateTimeAdapter extends XmlAdapter<String, Date> {
    @Override
    public Date unmarshal(String xml) {
        return Date.valueOf(xml);
    }

    @Override
    public String marshal(Date object) {
        return new SimpleDateFormat("yyyy-MM-dd").format(object);
    }
}

