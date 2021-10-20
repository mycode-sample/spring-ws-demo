package com.mycompany.hr.ws;

import org.dom4j.Element;
import org.dom4j.Node;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Endpoint
public class HolidayEndpoint {
    private static final Logger log = LoggerFactory.getLogger(HolidayEndpoint.class);
    private static final String NAMESPACE_URL = "http://mycompany.com/hr/schemas";
    private static final String START_DATE_XPATH = "/Holiday/StartDate";
    private static final String END_DATE_XPATH = "/Holiday/EndDate";
    private static final String NUMBER_XPATH = "/Employee/Number";
    private static final String FIRSTNAME_XPATH = "/Employee/FirstName";
    private static final String LASTNAME_XPATH = "/Employee/LastName";
    private static final String DATE_FORMAT = "yyyy-MM-dd";
    private HumanResourceService humanResource;

    @Autowired
    public HolidayEndpoint(HumanResourceService humanResource) {
        this.humanResource = humanResource;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "HolidayRequest")
    public void handleHolidayRequest(@RequestPayload Element element) throws ParseException {
        Node startDate = element.selectSingleNode(START_DATE_XPATH);
        Node endDate = element.selectSingleNode(END_DATE_XPATH);
        Node number = element.selectSingleNode(NUMBER_XPATH);
        Node firstName = element.selectSingleNode(FIRSTNAME_XPATH);
        Node lastName = element.selectSingleNode(LASTNAME_XPATH);
        SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
        String name = firstName.getText() + lastName.getText();
        this.humanResource.bookHoliday(format.parse(startDate.getText()), format.parse(endDate.getText()), name);
        log.info("人数:" + number.getText());
    }
}
