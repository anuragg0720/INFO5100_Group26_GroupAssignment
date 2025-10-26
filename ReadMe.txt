# Group Assignment 1: Implementing Access-Controlled Use Cases in a Digital University System 
# Group 26

## 🧭 Project Overview
This Java Swing application simulates a **Digital University System** with **role-based access control**, **GPA computation**, and **tuition payment** integration.  
Built and tested for **Apache NetBeans 16** and **JDK 25 (Temurin-25 LTS)**.

---

## ⚙️ Tech Stack
- Java SE (Swing GUI)
- NetBeans IDE 16 (Ant project)
- OpenJDK 25 LTS
- MVC-style package layout  
  (`model/`, `Professor_UI/`, `Student_UI/`, `AdminUI/`, `app/`)

---

## 🚀 Quick Start (NetBeans-ready)
1. **Unzip** the project folder.
2. **Open Project** → `assignment-3-geforce-main` in NetBeans.
3. If prompted, click **Resolve Problems → Select Platform → JDK 25**.
4. Right-click the project → **Clean and Build**.
5. Click **Run ▶** — the app launches a **Login / Role selector**.

---

## 🧑‍💻 Application Roles
| Role | Access & Responsibilities |
|------|----------------------------|
| **Admin** | Manage departments, professors, and global system setup. |
| **Faculty** | View courses taught, student performance, assign grades. |
| **Student** | Register courses, view transcript, pay tuition, check GPA. |

---

## 🔑 Access Control Layer
- On launch, a **Role Selector dialog** appears (Admin / Faculty / Student).
- The selected role controls what menus and features are accessible.
- “Session → Logout” allows switching roles without restarting.

---

## 💵 Tuition & Finance System
- Every student starts with a **balance** (seeded automatically).
- **Finance → Pay Tuition** menu lets the student pay outstanding balance.
- **Transcript is locked** until balance = 0.
- Payment history stored in `model.student.Finance`.

---

## 🎓 GPA Calculation
- GPA auto-computed in **Student Transcript**:
  - Grade-to-point map (A=4.0, A−=3.7, B+=3.3, …)
  - Displays **Overall GPA** + **Academic Standing** (Good / Probation)

---

## 🧩 Seeded Data (for demo)
Automatically initialized on startup:
- 10 professors  
- 5 sample courses  
- Pre-billed tuition for 1 student  
- All visible in tables/forms via your existing UI

---

## 🧱 Project Structure
src/
├── app/
│ ├── LoginLauncher.java → main entry point
│ ├── MainProfessor.java → alternate launcher
│ └── MainStudent.java → alternate launcher
├── Professor_UI/
│ └── mainJframe.java → main window + role logic
├── Student_UI/
│ └── Student_UI.java → student panels & transcript
├── model/
│ ├── course/ → course entities
│ ├── professor/ → professor models
│ └── student/ → student models + Finance, GradeUtil
└── AdminUI/
└── AdminPanel.java


---

## 🧰 Developer Notes
- Preserve all `.form` files — they maintain NetBeans **Design tab** layouts.
- Use `app.LoginLauncher` as the default run configuration.
- Project compiled with `javac.source=17` / `javac.target=17` (works fine on JDK 25).

---

## 🧪 Testing Checklist
✅ Launch app → Role selector appears  
✅ Switch roles via Session → Logout  
✅ Open Student Transcript → GPA + Standing visible  
✅ Tuition payment updates balance → Transcript unlocks  
✅ No compile/runtime errors on Clean & Build  

---

## 🧠 Future Enhancements
- Registrar dashboard  
- Persistent DB (SQLite/MySQL) backend  
- User authentication (username/password login)  
- Analytics dashboards with charts  

---

## 👥 Team / Contribution Template
| Name | NUID | Role | Contribution |
|------|------|------|---------------|
| Agnel Salve | 002545083 | Admin Part |
| Anurag Patwardhan | 002026703 | Faculty Part |
| Aatish Khune | 002516638 | Student Part |

---

## 🏁 Credits
Northeastern University – INFO5100  
Digital University System Project  
Instructor: *Prof. Khaled Bugrara*  
Team Submission: *Fall 2025*
