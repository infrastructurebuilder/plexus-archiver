module org.codehaus.plexus.archiver.usurped {
    exports org.codehaus.plexus.archiver;
    exports org.codehaus.plexus.archiver.manager;
    exports org.codehaus.plexus.archiver.zip;

    requires javax.inject;
    //    requires io.avaje.jsr305x;
    requires io.avaje.jsr305x;
    requires plexus.io;
    requires plexus.utils;
    requires org.apache.commons.compress;
    requires org.apache.commons.io;
    requires org.slf4j;
    requires snappy;
}
