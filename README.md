<!-- Suggested short description for the GitHub repo "About" box (this comment is invisible on GitHub):
"Hands-on solutions from Cognizant's Digital Nurture 5.0 Deep Skilling program — Java, Spring Boot, Microservices, React, PL/SQL, Docker, AWS and GenAI fundamentals." -->

<div align="center">

# Digital Nurture 5.0 — Java Full Stack Engineering (React)
### Deep Skilling Program · Cognizant

Hands-on solutions, exercises, and mini-projects completed as part of Cognizant's 7-week **Digital Nurture 5.0** Deep Skilling track for Java Full Stack Engineers with React.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![React](https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB)
![PL/SQL](https://img.shields.io/badge/PL%2FSQL-F80000?style=for-the-badge&logo=oracle&logoColor=white)
![JUnit5](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![AWS](https://img.shields.io/badge/AWS-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)

</div>

---

> **Status:**  Completed — self-paced exercises and mandatory hands-on work for every module pushed to this repository.

## Table of Contents
- [About This Repository](#about-this-repository)
- [Program Structure at a Glance](#program-structure-at-a-glance)
- [Repository Structure](#repository-structure)
- [Modules Covered](#modules-covered)
- [Mandatory Hands-on Exercises](#mandatory-hands-on-exercises)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
- [Learning Approach](#learning-approach)
- [Program Completion Criteria](#program-completion-criteria)
- [Acknowledgment and Disclaimer](#acknowledgment-and-disclaimer)

---

## About This Repository

This repo documents my learning journey through **Digital Nurture 5.0 (DN 5.0)**, Cognizant's structured deep-skilling program for Java Full Stack Engineers. Over 7 weeks (~10–12 hours/week), I worked through four engineering constructs — **Engineering Concepts → Programming Languages → Products & Frameworks → Platforms & GenAI** — building progressively from core CS fundamentals up to Spring Boot microservices, a React front end, and cloud/DevOps/GenAI essentials, backed by bi-weekly SME connect sessions and capped off with a Knowledge-Based Assessment (KBA).

Everything here — problem-solving approach, code, and notes — is my own original work, solved against the exercise briefs provided by the program.

## Program Structure at a Glance

| # | Construct | Focus | Skills |
|---|---|---|---|
| 1 | **Engineering Concepts** | The foundation every language/framework is built on | Design Patterns & Principles · Data Structures & Algorithms |
| 2 | **Programming Languages** | Turning logic into working code | Advanced PL/SQL · TDD with JUnit5 & Mockito · SLF4J Logging |
| 3 | **Products & Frameworks** | Building real, production-style applications | Spring Core & Maven · Spring Data JPA & Hibernate · SonarQube · Spring REST (Boot 3) · Microservices & Spring Cloud · React |
| 4 | **Platforms & GenAI** | Shipping, scaling, and AI-augmented development | Git · CI/CD · Docker · Agile · AWS Cloud Fundamentals · GenAI & GitHub Copilot |

**Suggested pacing** (per the program handbook):

| Topic(s) | Duration |
|---|---|
| Design Patterns & Principles + Data Structures & Algorithms | 2 days |
| PL/SQL + TDD (JUnit5/Mockito) + SLF4J | 3 days |
| Spring Core and Maven | 2 days |
| Spring Data JPA with Spring Boot, Hibernate | 0.5 week |
| Code Quality and SonarQube | 2 days |
| Spring REST using Spring Boot 3 | 1 week |
| Microservices with Spring Boot 3 and Spring Cloud | 0.5 week |
| React and Application Debugging | 2 weeks |
| Git, CI/CD, Docker, Cloud Fundamentals, GenAI Fundamentals | 1 week |

## Repository Structure

```
Digital-Nurture-5.0-Java-FSE-React/
├── 01-Design-Patterns-and-Principles/
├── 02-Data-Structures-and-Algorithms/
├── 03-PLSQL-Programming/
├── 04-TDD-JUnit-Mockito-SLF4J/
├── 05-Spring-Core-and-Maven/
├── 06-Spring-Data-JPA-Hibernate/
├── 07-Code-Quality-SonarQube/
├── 08-Spring-REST-SpringBoot3/
├── 09-Microservices-SpringCloud/
├── 10-React-SPA/
├── 11-Application-Debugging/
├── 12-Git-Version-Control/
├── 13-DevOps-CICD/
├── 14-Docker-Containerization/
├── 15-Agile-Methodology/
├── 16-Cloud-Fundamentals-AWS/
├── 17-GenAI-Fundamentals/
└── README.md
```
> Folder names above are a suggested layout — rename to match how you actually organized your pushed solutions (e.g. week-wise instead of module-wise).

## Modules Covered

| # | Module | What's Inside |
|---|---|---|
| 01 | Design Patterns & Principles | SOLID principles; Creational, Structural & Behavioral GoF patterns (Singleton, Factory, Adapter, Decorator, Observer, Strategy, etc.) |
| 02 | Data Structures & Algorithms | Arrays, linked lists, sorting (bubble/quick/merge), searching (linear/binary), time & space complexity |
| 03 | PL/SQL Programming | Variables, control structures, exception handling, cursors, stored procedures, functions, packages, triggers |
| 04 | TDD & Logging | Unit testing with JUnit5, mocking with Mockito, Arrange-Act-Assert pattern, Lombok, SLF4J logging |
| 05 | Spring Core & Maven | IoC / Dependency Injection, Spring bean configuration, AOP, Spring MVC basics, Maven project setup |
| 06 | Spring Data JPA & Hibernate | Entity mapping, Spring Data repositories, custom queries, pagination & sorting, auditing, projections |
| 07 | Code Quality & SonarQube | Static code analysis, quality gates, code smells, duplication & cyclomatic complexity |
| 08 | Spring REST (Spring Boot 3) | REST controllers, DTOs, CRUD APIs, HATEOAS, content negotiation, Swagger/OpenAPI, Spring Security & JWT |
| 09 | Microservices & Spring Cloud | Service discovery (Eureka), API Gateway, Feign clients, circuit breakers, centralized config |
| 10 | React (SPA) | Components & props, JSX, state & hooks, conditional rendering, lists/keys, forms, calling APIs with Axios/Fetch |
| 11 | Application Debugging | Chrome DevTools, breakpoints & DOM inspection, VS Code debugger |
| 12 | Git | Init/clone, staging & commits, branching & merging, remotes, forking, pull requests, collaboration workflows |
| 13 | DevOps & CI/CD | CI/CD concepts and pipelines, popular tooling (Jenkins, GitHub Actions, GitLab CI/CD) |
| 14 | Docker | Images & containers, volumes, networking, Docker Compose, orchestration basics |
| 15 | Agile Methodology | Scrum roles/ceremonies/artifacts, story points & planning poker, user stories, acceptance criteria |
| 16 | Cloud Fundamentals (AWS) | EC2, S3, EBS, VPC, ALB/NLB, RDS, DynamoDB, Lambda, API Gateway |
| 17 | GenAI Fundamentals | Prompt & context engineering, GitHub Copilot, responsible/ethical AI use, agentic AI basics |

*(Modules renumbered 1–17 sequentially for clarity — the source handbook labels both "Spring Data JPA/Hibernate" and "Code Quality/SonarQube" as "Module 6.")*

## Mandatory Hands-on Exercises

Per the program's completion criteria, at least one mandatory hands-on exercise was required for every skill. Highlights:

| Skill | Mandatory Exercises |
|---|---|
| Design Patterns & Principles | Singleton Pattern · Factory Method Pattern |
| Data Structures & Algorithms | E-commerce Platform Search Function · Financial Forecasting |
| PL/SQL Programming | Control Structures · Stored Procedures |
| JUnit5 | Setting Up JUnit · Assertions · Arrange-Act-Assert Pattern & Test Fixtures |
| Mockito | Mocking & Stubbing · Verifying Interactions |
| SLF4J | Logging Error Messages & Warning Levels |
| Spring Core & Maven | Basic Spring App Configuration · Dependency Injection · Maven Project Setup |
| Spring Data JPA & Hibernate | Spring Data JPA Quick Example · JPA vs. Hibernate vs. Spring Data JPA |
| Spring REST (Boot 3) | Spring Web Project Setup · XML-based Bean Config · Hello World REST Service · Country Web Service (CRUD) · JWT Authentication Service |
| Microservices | Account & Loan Microservices with API Gateway |
| React | 10 hands-on labs — components, forms, hooks, list rendering, API integration |
| Git | 5 hands-on labs — init/clone, branching, remotes, collaboration |

## Tech Stack

**Languages & Core:** Java · PL/SQL · JavaScript (ES6)
**Backend:** Spring Core · Spring Boot 3 · Spring Data JPA · Hibernate · Spring REST · Spring Security · Spring Cloud (Eureka, Feign, Config)
**Testing & Quality:** JUnit 5 · Mockito · SonarQube · Lombok · SLF4J
**Frontend:** React · JSX · Axios / Fetch API
**DevOps & Platforms:** Git · CI/CD (Jenkins / GitHub Actions) · Docker · AWS (EC2, S3, VPC, RDS, DynamoDB, Lambda, API Gateway)
**AI:** GitHub Copilot · Prompt & Context Engineering

## Getting Started

**Prerequisites**
- JDK 17+
- Maven 3.8+
- Node.js 18+ and npm
- Docker Desktop (for containerization modules)
- Git
- An IDE — IntelliJ IDEA / VS Code / Spring Tool Suite / Eclipse

**Running a backend (Spring Boot) module**
```bash
cd 08-Spring-REST-SpringBoot3
mvn spring-boot:run
```

**Running the React module**
```bash
cd 10-React-SPA
npm install
npm start
```

## Learning Approach

DN 5.0 combines two components:
- **Self-paced learning** through curated open-source references (GeeksforGeeks, Baeldung, official docs, etc.), plus select courses on Cognizant's SkillSpring AI-native learning platform.
- **Bi-weekly SME Connect sessions** with subject matter experts for doubt clarification and deeper insight into complex topics.

## Program Completion Criteria

-  **Hands-on exercises** completed and mapped against every skill in the curriculum.
-  **Final Knowledge-Based Assessment (KBA)** covering all 17 modules, taken at the end of the 7-week program.

## Acknowledgment and Disclaimer

This repository reflects my personal solutions completed as part of Cognizant's **Digital Nurture 5.0** Deep Skilling program (Java FSE – React track). The program curriculum, exercise problem statements, and reference material are the property of Cognizant and its linked open-source sources; only the implementations/solutions in this repo are my own original work, shared here for learning and portfolio purposes.

---

<div align="center">

**Md Mabud** — Java Full Stack Engineer Trainee · Cognizant Digital Nurture 5.0
Feel free to explore, star , or reach out with questions!

</div>
