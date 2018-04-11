package gorm.mongodb.map.binding

import grails.rest.RestfulController

class SampleController extends RestfulController<Sample> {
	static responseFormats = ['json']

    SampleController() {
        super(Sample)
    }
}
