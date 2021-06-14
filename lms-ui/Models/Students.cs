namespace lms_ui.Models
{
    using System.Collections.Generic;
    using System;
    public class Students
    {
        public string id {get; set;}
        public string firstname {get;set;}
        public string lastname {get;set;}
        public string middlename{get;set;}
        public string phone {get;set;}
        public string mail {get;set;}
        public DateTime dob {get; set;}  
        public bool sex {get;set;}
        public Faculties faculty {get;set;}
        public Classes classes{get;set;}
        public List<Courses> courses {get;set;}
    }
}