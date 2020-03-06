/*
 * YapstoneStagedOnBoardingServicesLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.yapstone.apiuat.models;

import java.util.*;

public class IndividualApplicantAdminFieldsResourceBuilder {
    //the instance to build
    private IndividualApplicantAdminFieldsResource individualApplicantAdminFieldsResource;

    /**
     * Default constructor to initialize the instance
     */
    public IndividualApplicantAdminFieldsResourceBuilder() {
        individualApplicantAdminFieldsResource = new IndividualApplicantAdminFieldsResource();
    }

    /**
     * value for graduation policy
     */
    public IndividualApplicantAdminFieldsResourceBuilder autoGraduated(Boolean autoGraduated) {
        individualApplicantAdminFieldsResource.setAutoGraduated(autoGraduated);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public IndividualApplicantAdminFieldsResource build() {
        return individualApplicantAdminFieldsResource;
    }
}