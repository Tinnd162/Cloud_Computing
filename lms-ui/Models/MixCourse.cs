namespace lms_ui.Models
{
    using System.Collections.Generic;
    using System;
    public class MixCourse
    {
        public string id { get; set; }
        public string name { get; set; }
        public string title {get;set;}
        public DateTime start_sem { get; set; }
        public DateTime end_sem { get; set; }
    }
}