package org.openapitools.client;

import org.openapitools.client.api.CoursePropertyReferenceControllerApi;
import org.openapitools.client.api.StudentEntityControllerApi;
import org.openapitools.client.api.StudentPropertyReferenceControllerApi;
import org.openapitools.client.model.*;

public class MainClass {
    public static void main(String[] args) throws ApiException {
        String apiURL = "http://localhost:8080";
        ApiClient client = new ApiClient();
        client.setBasePath(apiURL);

        //ID defaults to string even though its an int
        String studentID = "1";

        StudentEntityControllerApi studentEndpoint = new StudentEntityControllerApi(client);
        EntityModelStudent ems = studentEndpoint.getItemResourceStudentGet(studentID);


        StudentPropertyReferenceControllerApi studentReferenceEndpoint = new StudentPropertyReferenceControllerApi(client);
        EntityModelCourse emc = studentReferenceEndpoint.followPropertyReferenceStudentGet1(studentID);

        //cutting off end of path
        //links: associating key(map):value(link) pairs
        Link l = emc.getLinks().get("self");

        String courseHref = l.getHref();

        //gets index of last forward slash +1 (to obtain the info after it)
        String courseIndex = courseHref.substring(courseHref.lastIndexOf("/") + 1);

        //problems identifying relationships for some reason
        //very often get errors with this Client generator so to be expected

//        CoursePropertyReferenceControllerApi courseReferenceEndpoint = new CoursePropertyReferenceControllerApi(client);
//        EntityModelCoursename emcn = courseReferenceEndpoint.followPropertyReferenceCourseGet1(courseIndex);
//
//        EntityModelDegreetype emdt = courseReferenceEndpoint.followPropertyReferenceCourseGet2(courseIndex, "1");
//        System.out.println(emdt);

        System.out.println("id: " + ems.getId());
        System.out.println("name: " + ems.getName());
        System.out.println("address: " + ems.getAddress());
        System.out.println("dob: " + ems.getDob());
        //System.out.println("course: " + emdt.getShortcode() + " " + emcn.getCoursename());
    }
}
