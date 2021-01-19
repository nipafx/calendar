module dev.nipafx.calendar {
    requires spring.boot;
    requires spring.boot.starter.webflux;
    requires spring.boot.autoconfigure;

    requires spring.context;
    requires spring.beans;
    requires spring.web;
    requires com.fasterxml.jackson.databind;

    opens dev.nipafx.calendar.spring to spring.core, spring.beans, spring.context, spring.webflux;
    opens dev.nipafx.calendar.entries to com.fasterxml.jackson.databind;
    opens dev.nipafx.calendar.data to com.fasterxml.jackson.databind;
}
