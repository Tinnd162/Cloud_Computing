namespace lms_ui.Models
{
    using System.Collections.Generic;
    using System;
    using System.ComponentModel.DataAnnotations;

    public class Semesters
    {
        public string id { get; set; }
        public string title { get; set; }
        public DateTime startsem { get; set; }
        public DateTime endsem {get;set;}
    }
}