namespace lms_ui.Models
{
    public class Courses
    {
        public string id {get; set;}
        public string name {get; set;}
        public string description {get;set;}
        public Semesters semester{get;set;}
        public Subjects subject {get;set;}
    }
}